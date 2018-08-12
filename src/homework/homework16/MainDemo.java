package homework.homework16;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MainDemo {
    public static void main(String[] args) {
        Dump.addRandomDeatailInDump(20);
        Scientist ivanov = new Scientist("Ivanov");
        Scientist petrov = new Scientist("Petrov");
        final CyclicBarrier NIGHT = new CyclicBarrier(3, () -> System.out.println("Ночь завершилась"));

        Thread factory = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                try {
                    System.out.println("Фабрика выкинула на свалку детали");
                    Dump.addRandomDeatailInDump(1 + new Random().nextInt(4));
                    Thread.sleep(10);
                    try {
                        NIGHT.await();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread helperIvanova = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                try {
                    System.out.println("Помощник " + ivanov.getName() + "a ушел за деталями");
                    ivanov.setDetailsInStock(Dump.getDetailForScientist(1 + new Random().nextInt(4)));
                    try {
                        NIGHT.await();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread helperPetrova = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                try {
                    System.out.println("Помощник " + petrov.getName() + "a ушел за деталями");
                    petrov.setDetailsInStock(Dump.getDetailForScientist(1 + new Random().nextInt(4)));
                    try {
                        NIGHT.await();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        factory.start();
        helperIvanova.start();
        helperPetrova.start();

        try {
            factory.join();
            helperIvanova.join();
            helperPetrova.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Dump.print();
        ivanov.createRobot();
        petrov.createRobot();
    }
}
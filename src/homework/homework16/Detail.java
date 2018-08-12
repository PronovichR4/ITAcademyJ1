package homework.homework16;

public enum Detail implements Describe {

    HEAD("Голова"),
    BODY("Тело"),
    LEFTHAND("Левая рука"),
    RIGHTHAND("Правая рука"),
    LEFTFOOT("Левая нога"),
    RIGHTFOOT("Правая нога"),
    CPU("Процесор"),
    RAM("Оперативная память"),
    HDD("Жесткий диск");

    Detail(String description) {
        this.description = description;
    }

    private String description;

    @Override
    public String getDescription() {
        return this.description;
    }
}

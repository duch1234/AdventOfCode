package pl.developerpi91.guard;

public enum ActivitiEnum {
    WAKUP("."),
    ASLEEP("#");

    private String value;

    private ActivitiEnum(String value){
        this.value = value;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

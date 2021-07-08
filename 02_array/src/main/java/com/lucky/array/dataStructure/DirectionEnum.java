package com.lucky.array.dataStructure;

public enum DirectionEnum {
        RIGHT(1,"向右"),
        DOWN(2,"向下"),
        LEFT(3,"向左"),
        UP(0,"向上");

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        DirectionEnum(int code, String description) {
            this.code = code;
            this.description = description;
        }

        private int code;

        private String description;

        public static DirectionEnum getDirectionByCode(int code){
            for (DirectionEnum directionEnum : DirectionEnum.values()) {
                if (directionEnum.getCode() == code) {
                    return directionEnum;
                }
            }
            return null;
        }

}

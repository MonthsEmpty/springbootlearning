package com.vincent.basic.concurrent;

/**
 * Created by renwu on 2017/4/19.
 */
public enum LevelEnum {
    MIDDLE("bbb",1),LOWER("ccc",1),HIGH("aaa",1);
    private String type;
    private Integer id;

    LevelEnum(String type, Integer id) {
        this.type = type;
        this.id = id;
    }

    public static String getType(Integer id){
        for(LevelEnum levelEnum : LevelEnum.values()){
            if(levelEnum.getId() == id){
                return levelEnum.getType();
            }
        }
        return null;
    }

    public String getType() {
        return type;
    }

    public Integer getId() {
        return id;
    }
}

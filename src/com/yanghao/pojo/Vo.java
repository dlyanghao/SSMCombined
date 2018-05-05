package com.yanghao.pojo;

import java.util.List;

/*
用于传值的值对象
 */
public class Vo {

    private List<User> datas;

    public List<User> getDatas() {
        return datas;
    }

    public void setDatas(List<User> datas) {
        this.datas = datas;
    }
}

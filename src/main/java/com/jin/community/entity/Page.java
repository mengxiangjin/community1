package com.jin.community.entity;

public class Page {
    //当前页
    private int current=1;
    //每页显示的条数
    private int limit=10;
    //总数据数
    private int rows;
    //前台用于复用分页链接
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if (current>=1){
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if (limit>=1&&limit<=100){
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if (rows>=0){
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /*
    * 当前页起始行sql语句 limit offset limit
    * */
    public int getOffset(){
        return (this.current-1)*this.limit;
    }

    /*
    * 获取总页码数量
    * */
    public int getTotal(){
        if(this.rows%this.limit==0){
            return rows/limit;
        }else {
            return rows/limit+1;
        }
    }

    /*
    * 获取起始页（不可能前台一次性全部展示出页码）
    * */
    public int getFrom(){
        int from=this.current-2;
        return from<1?1:from;
    }

    /*
    *获取截止页（from--to）
    * */
    public int getTo(){
        return this.current+2>this.getTotal()?this.getTotal():this.current+2;
    }
}

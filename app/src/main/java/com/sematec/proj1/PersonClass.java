package com.sematec.proj1;

public class PersonClass {
    public PersonClass(String name,String family,long id,String mobile,int pic){
        setName(name);
        setFamily(family);
        setId(id);
        setMobile(mobile);
        setPic(pic);
    }
    private String name;
    private String family;
    private long id;
    private String mobile;
    private int pic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}


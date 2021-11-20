package com.just.builder;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class UserInfo {

    private String name;

    private String sex;

    private String email;

    private String address;

    private String age;

    private String school;

    // qq号码
    private String qq;

    //微信号码
    private String wx;

    // ...


    public UserInfo(Builder builder) {
        this.name = builder.name;
        this.sex = builder.sex;
        this.email = builder.email;
        this.address = builder.address;
        this.age = builder.age;
        this.school = builder.school;
        this.qq = builder.qq;
        this.wx = builder.wx;

    }

    public static class  Builder {

        private String name;

        private String sex;

        private String email;

        private String address;

        private String age;

        private String school;

        // qq号码
        private String qq;

        //微信号码
        private String wx;

        // ...

        public Builder setName(String name){

            this.name = name;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setAge(String age) {
            this.age = age;
            return this;
        }

        public Builder setSchool(String school) {
            this.school = school;
            return this;
        }

        public Builder setQq(String qq) {
            this.qq = qq;
            return this;
        }

        public Builder setWx(String wx) {
            this.wx = wx;
            return this;
        }

        public UserInfo build(){
            return new UserInfo(this);
        }
    }
}

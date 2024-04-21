package com.yk3;

import java.util.Objects;

public class User implements Cloneable {
    private String name;
    private Pass pass;

    public User(String name, Pass pass) {
        this.name = name;
        this.pass = pass;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pass getPass() {
        return pass;
    }

    public void setPass(Pass pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pass=" + pass +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User userCl = (User) super.clone();
        Pass passCl = (Pass) userCl.getPass().clone();
        userCl.setPass(passCl);
        return userCl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(pass, user.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pass);
    }
}

/*
Создать класс для описания пользователя системы.
Переопределить в классе методы toString,hashcode и equals.
Создать несколько экземпляров класса с одним и тем же
значением полей и сравнить с помощью метода equals.
 */

/*
Создать программу для реализации поверхностного и глубокого
 клонирования объекта класса User.
 Пусть на вход программе будет передаваться тип операции клонирования
 (поверхностное клонирование или глубокое), а также id юзера для клонирования.

 */

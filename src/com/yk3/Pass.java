package com.yk3;

import java.util.Objects;

public class Pass implements Cloneable {
    private int id;

    public Pass(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pass{" +
                "id=" + id +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pass pass = (Pass) o;
        return id == pass.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

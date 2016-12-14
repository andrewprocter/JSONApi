package com.gustavofao.jsonapi.Models;

import com.gustavofao.jsonapi.Annotations.SerialName;

import java.io.Serializable;

public class Links implements Serializable{
    private String self;
    @SerialName("first-page")
    private String first;
    @SerialName("prev-page")
    private String prev;
    @SerialName("next-page")
    private String next;
    @SerialName("last-page")
    private String last;
    private String related;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
    }
}

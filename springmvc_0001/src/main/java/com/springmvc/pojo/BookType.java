package com.springmvc.pojo;

import java.io.Serializable;

/**
 * 图书类型的POJO(MVC:model [data model])
 */
public class BookType implements Serializable {
    private String bookTypeNo;
    private String bookTypeName;
    private String bookTypeLinkUrl;
    private String bookTypeImgUrl;
    private String bookTypeParentNo;
    private String bookTypeOrderNo;
    private String bookTypeDescipt;

    @Override
    public String toString() {
        return "BookType{" +
                "bookTypeNo='" + bookTypeNo + '\'' +
                ", bookTypeName='" + bookTypeName + '\'' +
                ", bookTypeLinkUrl='" + bookTypeLinkUrl + '\'' +
                ", bookTypeImgUrl='" + bookTypeImgUrl + '\'' +
                ", bookTypeParentNo='" + bookTypeParentNo + '\'' +
                ", bookTypeOrderNo='" + bookTypeOrderNo + '\'' +
                ", bookTypeDescipt='" + bookTypeDescipt + '\'' +
                '}';
    }

    public BookType(String bookTypeName) {
        this.bookTypeName = bookTypeName;
    }

    public BookType() {
    }

    public BookType(String bookTypeNo, String bookTypeName, String bookTypeLinkUrl, String bookTypeImgUrl, String bookTypeParentNo, String bookTypeOrderNo, String bookTypeDescipt) {

        this.bookTypeNo = bookTypeNo;
        this.bookTypeName = bookTypeName;
        this.bookTypeLinkUrl = bookTypeLinkUrl;
        this.bookTypeImgUrl = bookTypeImgUrl;
        this.bookTypeParentNo = bookTypeParentNo;
        this.bookTypeOrderNo = bookTypeOrderNo;
        this.bookTypeDescipt = bookTypeDescipt;
    }

    public String getBookTypeNo() {

        return bookTypeNo;
    }

    public void setBookTypeNo(String bookTypeNo) {
        this.bookTypeNo = bookTypeNo;
    }

    public String getBookTypeName() {
        return bookTypeName;
    }

    public void setBookTypeName(String bookTypeName) {
        this.bookTypeName = bookTypeName;
    }

    public String getBookTypeLinkUrl() {
        return bookTypeLinkUrl;
    }

    public void setBookTypeLinkUrl(String bookTypeLinkUrl) {
        this.bookTypeLinkUrl = bookTypeLinkUrl;
    }

    public String getBookTypeImgUrl() {
        return bookTypeImgUrl;
    }

    public void setBookTypeImgUrl(String bookTypeImgUrl) {
        this.bookTypeImgUrl = bookTypeImgUrl;
    }

    public String getBookTypeParentNo() {
        return bookTypeParentNo;
    }

    public void setBookTypeParentNo(String bookTypeParentNo) {
        this.bookTypeParentNo = bookTypeParentNo;
    }

    public String getBookTypeOrderNo() {
        return bookTypeOrderNo;
    }

    public void setBookTypeOrderNo(String bookTypeOrderNo) {
        this.bookTypeOrderNo = bookTypeOrderNo;
    }

    public String getBookTypeDescipt() {
        return bookTypeDescipt;
    }

    public void setBookTypeDescipt(String bookTypeDescipt) {
        this.bookTypeDescipt = bookTypeDescipt;
    }
}

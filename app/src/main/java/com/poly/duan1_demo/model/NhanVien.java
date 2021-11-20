package com.poly.duan1_demo.model;

import android.os.Parcel;
import android.os.Parcelable;

public class NhanVien implements Parcelable {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String  identitycard;
    private String dateOfBirth;
    private byte[]image;
    private String passWord;
    private String place;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNote() {
        return place;
    }

    public void setNote(String place) {
        this.place = place;
    }

    public static Parcelable.Creator<NhanVien> getCREATOR() {
        return CREATOR;
    }

    public NhanVien() {
    }

    public NhanVien(int id, String name, String phone, String email, String identitycard, String dateOfBirth, byte[] image, String passWord, String place) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.identitycard = identitycard;
        this.dateOfBirth = dateOfBirth;
        this.image = image;
        this.passWord = passWord;
        this.place = place;
    }

    protected NhanVien(Parcel in) {
        id = in.readInt();
        name = in.readString();
        phone = in.readString();
        email = in.readString();
        identitycard = in.readString();
        dateOfBirth = in.readString();
        image = in.createByteArray();
        passWord = in.readString();
        place = in.readString();
    }

    public static final Parcelable.Creator<NhanVien> CREATOR = new Parcelable.Creator<NhanVien>() {
        @Override
        public NhanVien createFromParcel(Parcel in) {
            return new NhanVien(in);
        }

        @Override
        public NhanVien[] newArray(int size) {
            return new NhanVien[size];
        }
    };
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(name);
        parcel.writeString(phone);
        parcel.writeString(email);
        parcel.writeString(identitycard);
        parcel.writeString(dateOfBirth);
        parcel.writeByteArray(image);
        parcel.writeString(passWord);
        parcel.writeString(place);
    }
}

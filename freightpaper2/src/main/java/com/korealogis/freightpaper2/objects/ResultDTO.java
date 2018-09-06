package com.korealogis.freightpaper2.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultDTO {
    @SerializedName("processCode")
    @Expose
    public String processCode;
    @SerializedName("resultCode")
    @Expose
    public String resultCode;
    @SerializedName("resultMessage")
    @Expose
    public String resultMessage;

    @Override
    public String toString() {
        return "ResultDto{" +
                "processCode='" + processCode + '\'' +
                ", resultCode='" + resultCode + '\'' +
                ", resultMessage='" + resultMessage + '\'' +
                '}';
    }
}

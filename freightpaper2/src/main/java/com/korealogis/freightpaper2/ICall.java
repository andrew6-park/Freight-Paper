package com.korealogis.freightpaper2;

import com.korealogis.freightpaper2.objects.ResultDTO;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ICall {

    @GET("/blockChain/processCheck")
    Call<Void> makePaper(@Query("tiltle") String tiltle, @Query("docNum")String docNum, @Query("docDate")String docDate,@Query("round") boolean round,@Query("note") String note,
                         @Query("supplierCompanyName") String supplierCompanyName, @Query("supplierCompanyCode")String supplierCompanyCode,
                         @Query("supplierCeoName") String supplierCeoName, @Query("supplierAddressCity") String supplierAddressCity,@Query("supplierAddressKun") String supplierAddressKun,
                         @Query("supplierAddressDong") String supplierAddressDong,@Query("supplierAddressDitail") String supplierAddressDitail,@Query("supplierSellPhone") String supplierSellPhone,
                         @Query("supplierPhone") String supplierPhone,@Query("supplierFaxNum") String supplierFaxNum,@Query("supplierCompanyType") String supplierCompanyType,
                         @Query("supplierCompanyKind") String supplierCompanyKind,@Query("receiveCompanyName") String receiveCompanyName,@Query("receiveCompanyCode") String receiveCompanyCode,
                         @Query("receiveCeoName") String receiveCeoName,@Query("receiveAddressCity") String receiveAddressCity,@Query("receiveAddressKun") String receiveAddressKun,
                         @Query("receiveAddressDong") String receiveAddressDong,@Query("receiveAddressDitail") String receiveAddressDitail,@Query("receiveSellPhone") String receiveSellPhone,
                         @Query("receivePhone") String receivePhone,@Query("receiveFaxNum") String receiveFaxNum,@Query("receiveCompanyType") String receiveCompanyType,
                         @Query("receiveCompanyKind") String receiveCompanyKind,@Query("laCompanyName") String laCompanyName,@Query("laAddressCity") String laAddressCity,
                         @Query("laAddressKun") String laAddressKun,@Query("laAddressDong") String laAddressDong,@Query("laAddressDitail") String laAddressDitail,
                         @Query("laPersonInCharge") String laPersonInCharge,@Query("laSellPhone") String laSellPhone,@Query("laPhone") String laPhone,
                         @Query("laFaxNum") String laFaxNum,@Query("laSupplierDate") String laSupplierDate,@Query("soCompanyName") String soCompanyName,
                         @Query("soAddressCity") String soAddressCity,@Query("soAddressKun") String soAddressKun,@Query("soAddressDong") String soAddressDong,
                         @Query("soAddressDitail") String soAddressDitail,@Query("soPersonInCharge") String soPersonInCharge,@Query("soSellPhone") String soSellPhone,
                         @Query("soPhone") String soPhone,@Query("soFaxNum") String soFaxNum,@Query("stopOverDate") String stopOverDate,
                         @Query("cargoFormList") String cargoFormList);


    @FormUrlEncoded
    @POST("/blockChain/getOff")
    Call<ResultDTO> getOff(@Field("GetOffForm") JSONObject GetOffForm);

    @FormUrlEncoded
    @POST("/blockChain/simple")
    Call<ResultDTO> takeOver(@Field("TakeOverForm") JSONObject takeOverForm );

    @FormUrlEncoded
    @POST("/blockChain/transport")
    Call<ResultDTO> transport(@Field("transportForm") JSONObject transportForm);

    @FormUrlEncoded
    @POST("/blockChain/detailUpdate")
    Call<ResultDTO> detailUpdate(@Field("DetailForm") JSONObject DetailForm );

    @FormUrlEncoded
    @POST("/blockChain/simple")
    Call<ResultDTO> simple(@Field("SimpleForm") JSONObject SimpleForm );

}

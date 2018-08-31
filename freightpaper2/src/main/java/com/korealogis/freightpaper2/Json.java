package com.korealogis.freightpaper2;

import com.korealogis.freightpaper2.objects.CargoFormDTO;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class Json {


    public static JSONObject getOff(String carDetailOne, String carDetailTwo, String carGetOffOverDate, String carRandomNum,
                                    String carSing , String detailOne ,String detailTwo , String getOffDate ,String processCode,
                                    String randomNum ,String sing ){
        JSONObject jo = null;
        try {
            jo = new JSONObject();
            jo.put("carDetailOne",carDetailOne);
            jo.put("carDetailTwo",carDetailTwo);
            jo.put("carGetOffOverDate",carGetOffOverDate);
            jo.put("carRandomNum",carRandomNum);
            jo.put("carSign",carSing);
            jo.put("detailOne",detailOne);
            jo.put("detailTwo",detailTwo);
            jo.put("getOffDate",getOffDate);
            jo.put("processCode",processCode);
            jo.put("randomNum",randomNum);
            jo.put("sign",sing);
            return jo;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jo;
    }

    public static String simple(List<CargoFormDTO> cargoform, String docDate, String docNum, String laAddressCity,
                                String laAddressDitail,String laAddressDong, String laAddressKun, String laCompanyName,
                                String laFaxNum, String laPersonInCarge, String laPhone, String laSellPhone, String laSupplierDate,
                                String receiveAddressCity, String receiveAddressDitail, String receiveAddressDong,
                                String receiveAddressKun, String receiveCeoName, String receiveCompanyName, String receiveCompanyType,
                                String receiveFaxNum, String receivePhone, String receiveSellPhone, String soAddresssCity,
                                String soAddressDitail, String soAddressDong,String soAddressKun,String soCompanyName , String soFaxNum ,
                                String soPersonInCharge , String soPhone , String soSellPhone ,String  stopOverDate , String supplierAddressCity ,
                                String supplierAddressDitail, String supplierAddressDong  , String supplierAddressKun , String supplierCeoName ,
                                String supplierCompanyCode ,String supplierCompanyKind ,String supplierCompanyName ,String supplierCompanyType,
                                String supplierFaxNum ,String supplierPhone ,String supplierSellPhone ,String tiltle ){
        try {
            JSONObject jo = new JSONObject();
            JSONArray ja = new JSONArray();
            for(CargoFormDTO cargo : cargoform){
                JSONObject cargoObj = new JSONObject();
                cargoObj.put("cargoCount",cargo.cargoCount);
                        cargoObj.put("cargoName",cargo.cargoName);
                        cargoObj.put("cargoStandard",cargo.cargoStandard);
                        cargoObj.put("cargoWegit",cargo.cargoWegit);
                        cargoObj.put("note",cargo.note);
                        ja.put(cargoObj);
            }
            jo.put("cargoFormList", ja);
            jo.put("docDate",docDate);
            jo.put("docNum",docNum);
            jo.put("laAddressCity",laAddressCity);
            jo.put("laAddressDitail",laAddressDitail);
            jo.put("laAddressDong",laAddressDong);
            jo.put("laAddressKun",laAddressKun);
            jo.put("laCompanyName",laCompanyName);
            jo.put("laFaxNum",laFaxNum);
            jo.put("laPersonInCarge",laPersonInCarge);
            jo.put("laPhone",laPhone);
            jo.put("laSellPhone",laSellPhone);
            jo.put("laSupplierDate",laSupplierDate);
            jo.put("receiveAddressCity",receiveAddressCity);
            jo.put("receiveAddressDitail",receiveAddressDitail);
            jo.put("receiveAddressDong",receiveAddressDong);
            jo.put("receiveAddressKun",receiveAddressKun);
            jo.put("receiveCeoName",receiveCeoName);
            jo.put("receiveCompanyName",receiveCompanyName);
            jo.put("receiveCompanyType",receiveCompanyType);
            jo.put("receiveFaxNum",receiveFaxNum);
            jo.put("receivePhone",receivePhone);
            jo.put("receiveSellPhone",receiveSellPhone);
            jo.put("soAddresssCity",soAddresssCity);
            jo.put("soAddressDitail",soAddressDitail);
            jo.put("soAddressDong",soAddressDong);
            jo.put("soAddressKun",soAddressKun);
            jo.put("soCompanyName",soCompanyName);
            jo.put("soFaxNum",soFaxNum);
            jo.put("soPersonInCharge",soPersonInCharge);
            jo.put("soPhone",soPhone);
            jo.put("soSellPhone",soSellPhone);
            jo.put("supplierAddressDitail",supplierAddressDitail);
            jo.put("supplierAddressDong",supplierAddressDong);
            jo.put("stopOverDate",stopOverDate);
            jo.put("supplierAddressCity",supplierAddressCity);
            jo.put("supplierAddressKun",supplierAddressKun);
            jo.put("supplierCeoName",supplierCeoName);
            jo.put("supplierCompanyCode",supplierCompanyCode);
            jo.put("supplierCompanyKind",supplierCompanyKind);
            jo.put("supplierCompanyName",supplierCompanyName);
            jo.put("supplierCompanyType",supplierCompanyType);
            jo.put("supplierFaxNum",supplierFaxNum);
            jo.put("supplierPhone",supplierPhone);
            jo.put("supplierSellPhone",supplierSellPhone);
            jo.put("tiltle",tiltle);
            return jo.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return "";

    }

    public static JSONObject takeOver(String carDetailOne, String carDetailTwo, String carRandomNum, String carSing,
                                   String carTakeOverDate, String detailOne, String detailTwo, String processCode,
                                   String randomNum, String sing, String takeOverDate){
        JSONObject jo = null;
        try {
            jo = new JSONObject();
            jo.put("carDetailOne",carDetailOne);
            jo.put("carDetailTwo",carDetailTwo);
            jo.put("carRandomNum",carRandomNum);
            jo.put("carSign",carSing);
            jo.put("carTakeOverDate",carTakeOverDate);
            jo.put("detailOne",detailOne);
            jo.put("detailTwo",detailTwo);
            jo.put("processCode",processCode);
            jo.put("randomNum",randomNum);
            jo.put("sign",sing);
            jo.put("takeOverDate",takeOverDate);
            return jo;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jo;
    }

    public static JSONObject transportForm(String carNum, String carOwnerName,String carType,
                                       String carWegit,String companyName, String companyNum,
                                       String faxNum, String phone, String processCode, String sellPhone){
        JSONObject jo = null;
        try {
            jo = new JSONObject();
            jo.put("carNum",carNum);
            jo.put("carOwnerName",carOwnerName);
            jo.put("carType",carType);
            jo.put("carWeight",carWegit);
            jo.put("companyName",companyName);
            jo.put("companyNum",companyNum);
            jo.put("faxNum",faxNum);
            jo.put("phone",phone);
            jo.put("processCode",processCode);
            jo.put("sellPhone",sellPhone);
            return jo;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jo;
    }

}

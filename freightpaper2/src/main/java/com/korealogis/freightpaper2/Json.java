package com.korealogis.freightpaper2;

import com.korealogis.freightpaper2.objects.CargoFormDTO;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class Json {


    public static JSONObject getOff(String carDetailOne, String carDetailTwo, String carGetOffOverDate, String carRandomNum,
                                    String carSing, String detailOne, String detailTwo, String getOffDate, String processCode,
                                    String randomNum, String sign) {
        JSONObject jo = null;
        try {
            jo = new JSONObject();
            jo.put("carDetailOne", carDetailOne);
            jo.put("carDetailTwo", carDetailTwo);
            jo.put("carGetOffOverDate", carGetOffOverDate);
            jo.put("carRandomNum", carRandomNum);
            jo.put("carSign", carSing);
            jo.put("detailOne", detailOne);
            jo.put("detailTwo", detailTwo);
            jo.put("getOffDate", getOffDate);
            jo.put("processCode", processCode);
            jo.put("randomNum", randomNum);
            jo.put("sign", sign);
            return jo;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jo;
    }

    public static JSONObject simple(List<CargoFormDTO> cargoform, String docDate, String docNum, String laAddressCity,
                                    String laAddressDetail, String laAddressDong, String laAddressKun,
                                    String soAddresssCity, String soAddressDitail, String soAddressDong, String soAddressKun,
                                    String supplierCompanyCode, String supplierCompanyName, String supplierPhone,
                                    String supplierSellPhone, String title) {
        JSONObject jo = new JSONObject();
        try {
            JSONArray ja = new JSONArray();
            for (CargoFormDTO cargo : cargoform) {
                JSONObject cargoObj = new JSONObject();
                cargoObj.put("cargoCount", cargo.cargoCount);
                cargoObj.put("cargoName", cargo.cargoName);
                cargoObj.put("cargoStandard", cargo.cargoStandard);
                cargoObj.put("cargoWegit", cargo.cargoWegit);
                cargoObj.put("note", cargo.note);
                ja.put(cargoObj);
            }
            jo.put("cargoFormList", ja);
            jo.put("docDate", docDate);
            jo.put("docNum", docNum);
            jo.put("laAddressCity", laAddressCity);
            jo.put("laAddressDetail", laAddressDetail);
            jo.put("laAddressDong", laAddressDong);
            jo.put("laAddressKun", laAddressKun);
            jo.put("laCompanyName", "");
            jo.put("laFaxNum", "");
            jo.put("laPersonInCarge", "");
            jo.put("laPhone", "");
            jo.put("laSellPhone", "");
            jo.put("laSupplierDate", "");
            jo.put("receiveAddressCity", "");
            jo.put("receiveAddressDetail", "");
            jo.put("receiveAddressDong", "");
            jo.put("receiveAddressKun", "");
            jo.put("receiveCeoName", "");
            jo.put("receiveCompanyName", "");
            jo.put("receiveCompanyType", "");
            jo.put("receiveFaxNum", "");
            jo.put("receivePhone", "");
            jo.put("receiveSellPhone", "");
            jo.put("soAddresssCity", soAddresssCity);
            jo.put("soAddressDitail", soAddressDitail);
            jo.put("soAddressDong", soAddressDong);
            jo.put("soAddressKun", soAddressKun);
            jo.put("soCompanyName", "");
            jo.put("soFaxNum", "");
            jo.put("soPersonInCharge", "");
            jo.put("soPhone", "");
            jo.put("soSellPhone", "");
            jo.put("supplierAddressDetail", "");
            jo.put("supplierAddressDong", "");
            jo.put("stopOverDate", "");
            jo.put("supplierAddressCity", "");
            jo.put("supplierAddressKun", "");
            jo.put("supplierCeoName", "");
            jo.put("supplierCompanyCode", supplierCompanyCode);
            jo.put("supplierCompanyKind", "");
            jo.put("supplierCompanyName", supplierCompanyName);
            jo.put("supplierCompanyType", "");
            jo.put("supplierFaxNum", "");
            jo.put("supplierPhone", supplierPhone);
            jo.put("supplierSellPhone", supplierSellPhone);
            jo.put("title", title);
            return jo;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jo;

    }

    public static JSONObject takeOver(String carDetailOne, String carDetailTwo, String carRandomNum, String carSing,
                                      String carTakeOverDate, String detailOne, String detailTwo, String processCode,
                                      String randomNum, String sing, String takeOverDate) {
        JSONObject jo = null;
        try {
            jo = new JSONObject();
            jo.put("carDetailOne", carDetailOne);
            jo.put("carDetailTwo", carDetailTwo);
            jo.put("carRandomNum", carRandomNum);
            jo.put("carSign", carSing);
            jo.put("carTakeOverDate", carTakeOverDate);
            jo.put("detailOne", detailOne);
            jo.put("detailTwo", detailTwo);
            jo.put("processCode", processCode);
            jo.put("randomNum", randomNum);
            jo.put("sign", sing);
            jo.put("takeOverDate", takeOverDate);
            return jo;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jo;
    }

    public static JSONObject transportForm(String carNum, String carOwnerName, String carType,
                                           String carWegit, String companyName, String companyNum,
                                           String faxNum, String phone, String processCode, String sellPhone) {
        JSONObject jo = null;
        try {
            jo = new JSONObject();
            jo.put("carNum", carNum);
            jo.put("carOwnerName", carOwnerName);
            jo.put("carType", carType);
            jo.put("carWeight", carWegit);
            jo.put("companyName", companyName);
            jo.put("companyNum", companyNum);
            jo.put("faxNum", faxNum);
            jo.put("phone", phone);
            jo.put("processCode", processCode);
            jo.put("sellPhone", sellPhone);
            return jo;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jo;
    }

}

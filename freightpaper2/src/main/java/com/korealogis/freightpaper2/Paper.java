package com.korealogis.freightpaper2;

import android.util.Log;
import android.widget.Toast;

import com.korealogis.freightpaper2.objects.CargoFormDTO;
import com.korealogis.freightpaper2.objects.ResultDTO;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Paper {


    public static void makePager(String supplierCompanyName, String supplierPhone, String supplierCompanyCode, String cellPhone,
                                 String docDate, String docNum, String title,
                                 String laAddressDetail, String laAddressCity, String laAddressKun, String laAddressDong, String soAddressDitail,
                                 String soAddresssCity, String soAddressKun, String soAddressDong,
                                 String money, String fee, String cargoName, String cargoWeigt) {
        final boolean[] isSucess = {false};
        CargoFormDTO cargoform = new CargoFormDTO();
        cargoform.cargoWeight = cargoWeigt;
        cargoform.cargoName = cargoName;
        cargoform.cargoCount = money;
        List<CargoFormDTO> list = new ArrayList<>();
        list.add(cargoform);

        Call<ResultDTO> retro = RetrofitClient.get().simple(Json.simple(list, supplierCompanyName, supplierPhone, supplierCompanyCode, cellPhone,
                docDate, docNum, title,
                laAddressDetail, laAddressCity, laAddressKun, laAddressDong, soAddressDitail,
                soAddresssCity, soAddressKun, soAddressDong));
        retro.enqueue(new Callback<ResultDTO>() {
            @Override
            public void onResponse(Call<ResultDTO> call, Response<ResultDTO> response) {
                if (response.isSuccessful()) {
                    ResultDTO body = response.body();
                    String resultCode = body.resultCode;
                    if (resultCode.equals("100")) {
                        Log.i("zest", "블록체인생성");
                    } else {
                        String resultMsg = body.resultMessage;
                        Log.w("zest", resultMsg);
                    }
                    isSucess[0] = true;
                } else {
                    Log.w("zest", "fail");
                }
            }

            @Override
            public void onFailure(Call<ResultDTO> call, Throwable t) {
                Log.e("zest", "throwable: " + t.toString());
            }
        });
    }

//    public static void changePager(List<CargoFormDTO> cargoform, String docDate, String docNum, String laAddressCity,
//                                   String laAddressDetail, String laAddressDong, String laAddressKun, String laCompanyName,
//                                   String laFaxNum, String laPersonInCarge, String laPhone, String laSellPhone, String laSupplierDate,
//                                   String receiveAddressCity, String receiveAddressDetail, String receiveAddressDong,
//                                   String receiveAddressKun, String receiveCeoName, String receiveCompanyName, String receiveCompanyType,
//                                   String receiveFaxNum, String receivePhone, String receiveSellPhone, String soAddresssCity,
//                                   String soAddressDitail, String soAddressDong, String soAddressKun, String soCompanyName, String soFaxNum,
//                                   String soPersonInCharge, String soPhone, String soSellPhone, String stopOverDate, String supplierAddressCity,
//                                   String supplierAddressDetail, String supplierAddressDong, String supplierAddressKun, String supplierCeoName,
//                                   String supplierCompanyCode, String supplierCompanyKind, String supplierCompanyName, String supplierCompanyType,
//                                   String supplierFaxNum, String supplierPhone, String supplierSellPhone, String title) {
//        final boolean[] isSucess = {false};
//        Call<ResultDTO> retro = RetrofitClient.get().detailUpdate(Json.simple(cargoform, docDate, docNum, laAddressCity,
//                laAddressDetail, laAddressDong, laAddressKun, laCompanyName, laFaxNum, laPersonInCarge, laPhone, laSellPhone, laSupplierDate,
//                receiveAddressCity, receiveAddressDetail, receiveAddressDong, receiveAddressKun, receiveCeoName, receiveCompanyName, receiveCompanyType,
//                receiveFaxNum, receivePhone, receiveSellPhone, soAddresssCity, soAddressDitail, soAddressDong, soAddressKun, soCompanyName, soFaxNum,
//                soPersonInCharge, soPhone, soSellPhone, stopOverDate, supplierAddressCity, supplierAddressDetail, supplierAddressDong, supplierAddressKun,
//                supplierCeoName, supplierCompanyCode, supplierCompanyKind, supplierCompanyName, supplierCompanyType, supplierFaxNum, supplierPhone, supplierSellPhone, title);
//        retro.enqueue(new Callback<ResultDTO>() {
//            @Override
//            public void onResponse(Call<ResultDTO> call, Response<ResultDTO> response) {
//                if (response.isSuccessful()) {
//                    ResultDTO body = response.body();
//                    Log.i("zest", body.toString());
//                    isSucess[0] = true;
//                } else {
//                    Log.i("zest", "fail");
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ResultDTO> call, Throwable t) {
//                Log.i("zest", "throwable: " + t.toString());
//            }
//        });
//    }

    /**
     * 인수증생성
     *
     * @param title                 문서제목
     * @param docNum                문서번호
     * @param docDate               문서생성일시 date-time
     * @param round                 왕복여부 boolean
     * @param note                  인수증메모
     * @param supplierCompanyName   공급자상호
     * @param supplierCompanyCode   공급자사업자등록번호
     * @param supplierCeoName       공급자대표자이름
     * @param supplierAddressCity   공급자주소시구
     * @param supplierAddressKun    공급자주소군구
     * @param supplierAddressDong   공급자주소동읍
     * @param supplierAddressDetail 공급자주소상세
     * @param supplierSellPhone     공급자휴대폰
     * @param supplierPhone         공급자유선전화
     * @param supplierFaxNum        공급자팩스번호
     * @param supplierCompanyType   공급자업태
     * @param supplierCompanyKind   공급자종목
     * @param receiveCompanyName    공급받는자상호
     * @param receiveCompanyCode    공급받는자사업자등록번호
     * @param receiveCeoName        공급받는자대표자이름
     * @param receiveAddressCity    공급받는자주소시구
     * @param receiveAddressKun     공급받는자주소군구
     * @param receiveAddressDong    공급받는자주소동읍
     * @param receiveAddressDetail  공급받는자주소상세
     * @param receiveSellPhone      공급받는자휴대폰
     * @param receivePhone          공급받는자유선전화
     * @param receiveFaxNum         공급받는자팩스번호
     * @param receiveCompanyType    공급받는자업태
     * @param receiveCompanyKind    공급받는자종목
     * @param laCompanyName         상자치상호
     * @param laAddressCity         상차지주소시구
     * @param laAddressKun          상차이주소군구
     * @param laAddressDong         상차지주소동읍
     * @param laAddressDetail       상차지주소상세
     * @param laPersonInCharge      상차지담당자명
     * @param laSellPhone           상차지핸드폰
     * @param laPhone               상차지유선전화
     * @param laFaxNum              상차지팩스번호
     * @param laSupplierDate        상차지상차일시 date-time
     * @param soCompanyName         하차지상호
     * @param soAddressCity         하차지주소시구
     * @param soAddressKun          하차지주소군구
     * @param soAddressDong         하차지주소동읍
     * @param soAddressDitail       하차지주소상세
     * @param soPersonInCharge      하차지담당자명
     * @param soSellPhone           하차지핸드폰
     * @param soPhone               하차지유선전화
     * @param soFaxNum              하차지팩스번호
     * @param stopOverDate          하차지하차일시 date-time
     * @param cargoFormList         품목리스트
     * @return
     */
    public static void processCheck(String title, String docNum, String docDate, boolean round, String note,
                                    String supplierCompanyName, String supplierCompanyCode,
                                    String supplierCeoName, String supplierAddressCity, String supplierAddressKun,
                                    String supplierAddressDong, String supplierAddressDetail, String supplierSellPhone,
                                    String supplierPhone, String supplierFaxNum, String supplierCompanyType,
                                    String supplierCompanyKind, String receiveCompanyName, String receiveCompanyCode,
                                    String receiveCeoName, String receiveAddressCity, String receiveAddressKun,
                                    String receiveAddressDong, String receiveAddressDetail, String receiveSellPhone,
                                    String receivePhone, String receiveFaxNum, String receiveCompanyType,
                                    String receiveCompanyKind, String laCompanyName, String laAddressCity,
                                    String laAddressKun, String laAddressDong, String laAddressDetail,
                                    String laPersonInCharge, String laSellPhone, String laPhone,
                                    String laFaxNum, String laSupplierDate, String soCompanyName,
                                    String soAddressCity, String soAddressKun, String soAddressDong,
                                    String soAddressDitail, String soPersonInCharge, String soSellPhone,
                                    String soPhone, String soFaxNum, String stopOverDate,
                                    String cargoFormList) {

        final boolean[] isSucess = {false};
        Call<Void> retro = RetrofitClient.get().processCheck(title, docNum, docDate, round, note,
                supplierCompanyName, supplierCompanyCode,
                supplierCeoName, supplierAddressCity, supplierAddressKun,
                supplierAddressDong, supplierAddressDetail, supplierSellPhone,
                supplierPhone, supplierFaxNum, supplierCompanyType,
                supplierCompanyKind, receiveCompanyName, receiveCompanyCode,
                receiveCeoName, receiveAddressCity, receiveAddressKun,
                receiveAddressDong, receiveAddressDetail, receiveSellPhone,
                receivePhone, receiveFaxNum, receiveCompanyType,
                receiveCompanyKind, laCompanyName, laAddressCity,
                laAddressKun, laAddressDong, laAddressDetail,
                laPersonInCharge, laSellPhone, laPhone,
                laFaxNum, laSupplierDate, soCompanyName,
                soAddressCity, soAddressKun, soAddressDong,
                soAddressDitail, soPersonInCharge, soSellPhone,
                soPhone, soFaxNum, stopOverDate,
                cargoFormList);
        retro.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {

            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {

            }
        });
    }

    /**
     * 차주가 업무 수락
     *
     * @param carNum       차량번호
     * @param carOwnerName 차주명
     * @param carType      차종
     * @param carWegit     톤수
     * @param companyName  운송사명
     * @param companyNum   사업자등록번호
     * @param faxNum       팩스번호
     * @param phone        유선전화
     * @param processCode  블록체인 프로세스 코드
     * @param sellPhone    휴대폰
     * @return
     */
    public static boolean transPort(String carNum, String carOwnerName, String carType,
                                    String carWegit, String companyName, String companyNum,
                                    String faxNum, String phone, String processCode, String sellPhone) {
        final boolean[] isSucess = {false};
        Call<ResultDTO> retro = RetrofitClient.get().transport(Json.transportForm(carNum, carOwnerName, carType, carWegit, companyName, companyNum, faxNum, phone, processCode, sellPhone));
        retro.enqueue(new Callback<ResultDTO>() {
            @Override
            public void onResponse(Call<ResultDTO> call, Response<ResultDTO> response) {
                if (response.isSuccessful()) {
                    ResultDTO body = response.body();
                    Log.i("zest", body.toString());
                    isSucess[0] = true;
                } else {
                    Log.i("zest", "fail");
                }
            }

            @Override
            public void onFailure(Call<ResultDTO> call, Throwable t) {
                Log.i("zest", "throwable: " + t.toString());
            }
        });
        return isSucess[0];
    }

    /**
     * 차주상차
     *
     * @param carDetailOne    차주확인내용상세1
     * @param carDetailTwo    차주확인내용상세2
     * @param carRandomNum    차주인수난수값
     * @param carSing         차주인수확인서명정보
     * @param carTakeOverDate 차주인수확인일시
     * @param detailOne       관리자확인내용상세1
     * @param detailTwo       관리자확인내용상세2
     * @param processCode     블록체인프로세스코드
     * @param randomNum       관리자인수확인난수값
     * @param sing            관리자인수확인서명정보
     * @param takeOverDate    관리자인수확인일시
     * @return
     */
    public static boolean takeOver(String carDetailOne, String carDetailTwo, String carRandomNum,
                                   String carSing, String carTakeOverDate, String detailOne, String detailTwo,
                                   String processCode, String randomNum, String sing, String takeOverDate) {
        final boolean[] isSucess = {false};
        Call<ResultDTO> retro = RetrofitClient.get().takeOver(Json.takeOver(carDetailOne, carDetailTwo, carRandomNum, carSing, carTakeOverDate, detailOne, detailTwo, processCode, randomNum, sing, takeOverDate));
        retro.enqueue(new Callback<ResultDTO>() {
            @Override
            public void onResponse(Call<ResultDTO> call, Response<ResultDTO> response) {
                if (response.isSuccessful()) {
                    ResultDTO body = response.body();
                    Log.i("zest", body.toString());
                    isSucess[0] = true;
                } else {
                    Log.i("zest", "fail");
                }
            }

            @Override
            public void onFailure(Call<ResultDTO> call, Throwable t) {

            }
        });
        return false;
    }

    /**
     * 목적지하차
     *
     * @param carDetailOne      차주확인내용상세1
     * @param carDetailTwo      차주확인내용상세2
     * @param carGetOffOverDate 차주인수확인일시
     * @param carRandomNum      차주인수확인난수값
     * @param carSign           차주인수확인서명정보
     * @param detailOne         관리자확인내용상세1
     * @param detailTwo         관리자확인내용상세2
     * @param getOffDate        관리자인수확인일시
     * @param processCode       블록체인프로세스코드
     * @param randomNum         관리자인수확인난수값
     * @param sign              관리자인수확인서명정보
     * @return
     */
    public static boolean getOff(String carDetailOne, String carDetailTwo, String carGetOffOverDate,
                                 String carRandomNum, String carSign, String detailOne, String detailTwo,
                                 String getOffDate, String processCode, String randomNum, String sign) {
        final boolean[] isSuccess = {false};
        Call<ResultDTO> retro = RetrofitClient.get().getOff(Json.getOff(carDetailOne, carDetailTwo, carGetOffOverDate, carRandomNum, carSign, detailOne, detailTwo, getOffDate, processCode, randomNum, sign));
        retro.enqueue(new Callback<ResultDTO>() {
            @Override
            public void onResponse(Call<ResultDTO> call, Response<ResultDTO> response) {
                if (response.isSuccessful()) {
                    ResultDTO body = response.body();
                    Log.i("zest", body.toString());
                    isSuccess[0] = true;
                } else {
                    Log.i("zest", "fail");
                }
            }

            @Override
            public void onFailure(Call<ResultDTO> call, Throwable t) {

            }
        });
        return false;
    }
}

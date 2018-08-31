package com.korealogis.freightpaper2;

import android.util.Log;

import com.korealogis.freightpaper2.objects.ResultDTO;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Paper {

    /**
     * 인수증생성
     * @param tiltle 문서제목
     * @param docNum 문서번호
     * @param docDate 문서생성일시 date-time
     * @param round 왕복여부 boolean
     * @param note 인수증메모
     * @param supplierCompanyName 공급자상호
     * @param supplierCompanyCode 공급자사업자등록번호
     * @param supplierCeoName 공급자대표자이름
     * @param supplierAddressCity 공급자주소시구
     * @param supplierAddressKun 공급자주소군구
     * @param supplierAddressDong 공급자주소동읍
     * @param supplierAddressDitail 공급자주소상세
     * @param supplierSellPhone 공급자휴대폰
     * @param supplierPhone 공급자유선전화
     * @param supplierFaxNum 공급자팩스번호
     * @param supplierCompanyType 공급자업태
     * @param supplierCompanyKind 공급자종목
     * @param receiveCompanyName 공급받는자상호
     * @param receiveCompanyCode 공급받는자사업자등록번호
     * @param receiveCeoName 공급받는자대표자이름
     * @param receiveAddressCity 공급받는자주소시구
     * @param receiveAddressKun 공급받는자주소군구
     * @param receiveAddressDong 공급받는자주소동읍
     * @param receiveAddressDitail 공급받는자주소상세
     * @param receiveSellPhone 공급받는자휴대폰
     * @param receivePhone 공급받는자유선전화
     * @param receiveFaxNum 공급받는자팩스번호
     * @param receiveCompanyType 공급받는자업태
     * @param receiveCompanyKind 공급받는자종목
     * @param laCompanyName 상자치상호
     * @param laAddressCity 상차지주소시구
     * @param laAddressKun 상차이주소군구
     * @param laAddressDong  상차지주소동읍
     * @param laAddressDitail 상차지주소상세
     * @param laPersonInCharge 상차지담당자명
     * @param laSellPhone 상차지핸드폰
     * @param laPhone 상차지유선전화
     * @param laFaxNum 상차지팩스번호
     * @param laSupplierDate 상차지상차일시 date-time
     * @param soCompanyName 하차지상호
     * @param soAddressCity 하차지주소시구
     * @param soAddressKun 하차지주소군구
     * @param soAddressDong 하차지주소동읍
     * @param soAddressDitail 하차지주소상세
     * @param soPersonInCharge 하차지담당자명
     * @param soSellPhone 하차지핸드폰
     * @param soPhone 하차지유선전화
     * @param soFaxNum 하차지팩스번호
     * @param stopOverDate 하차지하차일시 date-time
     * @param cargoFormList 품목리스트
     * @return
     */
    public static void makePaper(String tiltle, String docNum, String docDate, boolean round, String note,
                                    String supplierCompanyName, String supplierCompanyCode,
                                    String supplierCeoName, String supplierAddressCity, String supplierAddressKun,
                                    String supplierAddressDong, String supplierAddressDitail, String supplierSellPhone,
                                    String supplierPhone, String supplierFaxNum, String supplierCompanyType,
                                    String supplierCompanyKind, String receiveCompanyName, String receiveCompanyCode,
                                    String receiveCeoName, String receiveAddressCity, String receiveAddressKun,
                                    String receiveAddressDong, String receiveAddressDitail, String receiveSellPhone,
                                    String receivePhone, String receiveFaxNum, String receiveCompanyType,
                                    String receiveCompanyKind, String laCompanyName, String laAddressCity,
                                    String laAddressKun, String laAddressDong, String laAddressDitail,
                                    String laPersonInCharge, String laSellPhone, String laPhone,
                                    String laFaxNum, String laSupplierDate, String soCompanyName,
                                    String soAddressCity, String soAddressKun, String soAddressDong,
                                    String soAddressDitail, String soPersonInCharge, String soSellPhone,
                                    String soPhone, String soFaxNum, String stopOverDate,
                                    String cargoFormList) {

        final boolean[] isSucess = {false};
        Call<Void> retro = RetrofitClient.get().makePaper( tiltle,  docNum,  docDate,  round,  note,
                 supplierCompanyName,  supplierCompanyCode,
                 supplierCeoName,  supplierAddressCity,  supplierAddressKun,
                 supplierAddressDong,  supplierAddressDitail,  supplierSellPhone,
                 supplierPhone,  supplierFaxNum,  supplierCompanyType,
                 supplierCompanyKind,  receiveCompanyName,  receiveCompanyCode,
                 receiveCeoName,  receiveAddressCity,  receiveAddressKun,
                 receiveAddressDong,  receiveAddressDitail,  receiveSellPhone,
                 receivePhone,  receiveFaxNum,  receiveCompanyType,
                 receiveCompanyKind,  laCompanyName,  laAddressCity,
                 laAddressKun,  laAddressDong,  laAddressDitail,
                 laPersonInCharge,  laSellPhone,  laPhone,
                 laFaxNum,  laSupplierDate,  soCompanyName,
                 soAddressCity,  soAddressKun,  soAddressDong,
                 soAddressDitail,  soPersonInCharge,  soSellPhone,
                 soPhone,  soFaxNum,  stopOverDate,
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
     * @param carNum 차량번호
     * @param carOwnerName 차주명
     * @param carType 차종
     * @param carWegit 톤수
     * @param companyName 운송사명
     * @param companyNum 사업자등록번호
     * @param faxNum 팩스번호
     * @param phone 유선전화
     * @param processCode 블록체인 프로세스 코드
     * @param sellPhone 휴대폰
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
     * @param carDetailOne 차주확인내용상세1
     * @param carDetailTwo 차주확인내용상세2
     * @param carRandomNum 차주인수난수값
     * @param carSing 차주인수확인서명정보
     * @param carTakeOverDate 차주인수확인일시
     * @param detailOne 관리자확인내용상세1
     * @param detailTwo 관리자확인내용상세2
     * @param processCode 블록체인프로세스코드
     * @param randomNum 관리자인수확인난수값
     * @param sing 관리자인수확인서명정보
     * @param takeOverDate 관리자인수확인일시
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
     * @param carDetailOne 차주확인내용상세1
     * @param carDetailTwo 차주확인내용상세2
     * @param carGetOffOverDate 차주인수확인일시
     * @param carRandomNum 차주인수확인난수값
     * @param carSing 차주인수확인서명정보
     * @param detailOne 관리자확인내용상세1
     * @param detailTwo 관리자확인내용상세2
     * @param getOffDate 관리자인수확인일시
     * @param processCode 블록체인프로세스코드
     * @param randomNum 관리자인수확인난수값
     * @param sing 관리자인수확인서명정보
     * @return
     */
    public static boolean getOff(String carDetailOne, String carDetailTwo, String carGetOffOverDate,
                                 String carRandomNum, String carSing, String detailOne, String detailTwo,
                                 String getOffDate, String processCode, String randomNum, String sing) {
        final boolean[] isSuccess = {false};
        Call<ResultDTO> retro = RetrofitClient.get().getOff(Json.getOff(carDetailOne, carDetailTwo, carGetOffOverDate, carRandomNum, carSing, detailOne, detailTwo, getOffDate, processCode, randomNum, sing));
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

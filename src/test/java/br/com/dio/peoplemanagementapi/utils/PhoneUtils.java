package br.com.dio.peoplemanagementapi.utils;

import br.com.dio.peoplemanagementapi.dto.PhoneDTO;
import br.com.dio.peoplemanagementapi.entity.Phone;
import br.com.dio.peoplemanagementapi.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "1198425-0621";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO(){
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity(){
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }


}

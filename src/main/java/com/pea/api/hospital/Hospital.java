/*
기준일시,"검체채취가능여부",시도,시군구,의료기관명 ,주소,대표 전화번호
2020년 06월 09일 18시,O,서울,강남구,강남구보건소,서울특별시 강남구 선릉로 668 (삼성동),02-3423-5555

 */

package com.pea.api.hospital;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class Hospital {
    private boolean enabled;
    private String region;
    private String name;
    private String callNumber;

    public Hospital(boolean enabled, String region, String name, String callNumber){
        this.enabled = enabled;
        this.region = region;
        this.name = name;
        this.callNumber = callNumber;
    }

}

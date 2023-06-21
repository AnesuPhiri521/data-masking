package io.github.anesuphiri521.DataMasking.Dto.Response;

/*
 * @created - 19/06/2023
 * @project - DataMasking
 * @author - anesuphiri - sehphirry@gmail.com
 */
public class MaskingResponse {
    private String data;
    private String maskedData;
    private String narrative;


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMaskedData() {
        return maskedData;
    }

    public void setMaskedData(String maskedData) {
        this.maskedData = maskedData;
    }

    public String getNarrative() {
        return narrative;
    }

    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }


    public MaskingResponse() {}

    //Constructor that returns response
    public MaskingResponse(String data, String maskedData, String narrative) {
        this.data = data;
        this.maskedData = maskedData;
        this.narrative = narrative;
    }

    @Override
    public String toString() {
        return "MaskingResponse{" +
                "data='" + data + '\'' +
                ", maskedData='" + maskedData + '\'' +
                ", narrative='" + narrative + '\'' +
                '}';
    }
}

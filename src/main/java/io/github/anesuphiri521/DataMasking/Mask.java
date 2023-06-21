package io.github.anesuphiri521.DataMasking;

import io.github.anesuphiri521.DataMasking.Dto.Response.MaskingResponse;

import java.util.stream.IntStream;

import static io.github.anesuphiri521.DataMasking.utils.Constants.*;

/*
 * @created - 19/06/2023
 * @project - DataMasking
 * @author - anesuphiri - sehphirry@gmail.com
 */

public class Mask {

    public MaskingResponse defaultFixedPositionMasking(String data, int startPosition, int endPosition){
        return maskingProcess(data, startPosition, endPosition, '*');
    }

    public MaskingResponse customCharacterFixedPositionMasking(String data, int startPosition, int endPosition, char maskingCharacter){
        return maskingProcess(data, startPosition, endPosition, maskingCharacter);
    }

    public MaskingResponse customMasking(String data, String maskSample){
        int index = 0;
        StringBuilder maskedData = new StringBuilder();
        for (int i = 0; i < maskSample.length(); i++) {
            char c = maskSample.charAt(i);
            if (c == '#') {
                maskedData.append(data.charAt(index));
                index++;
            } else if (c == 'x') {
                maskedData.append(c);
                index++;
            } else {
                maskedData.append(c);
            }
        }

        return new MaskingResponse(data, maskedData.toString(), MASKING_SUCCESSFUL);
    }

    private static MaskingResponse maskingProcess(String data, int startPosition, int endPosition, char maskingCharacter) {
        if (data.length() < endPosition || data.length() < startPosition || startPosition > endPosition)
            return new MaskingResponse(data,null, FAILED_TO_MASK);

        StringBuilder mask = new StringBuilder();
        if(endPosition - startPosition >=1)
            IntStream.rangeClosed(startPosition, endPosition).forEach(i -> mask.append(maskingCharacter));

        StringBuilder stringBuilder = new StringBuilder(data);
        String maskedData = stringBuilder.replace(startPosition, endPosition, mask.toString()).toString();

        return new MaskingResponse(data, maskedData, MASKING_SUCCESSFUL);
    }
}

package c.mars.tostringbuilder;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Constantine Mars on 12/29/15.
 */
@Data @AllArgsConstructor
public class Phone {
    String model;
    String vendor;
    double memory;
    int price;
    int simCards;

    @Override
    public String toString() {
        StandardToStringStyle style = new StandardToStringStyle();
        style.setFieldSeparator(", ");
        return new ReflectionToStringBuilder(this, style)
                .append(model)
                .append(price)
                .toString();
    }
}

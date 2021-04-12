package com.techelevator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FlowerShopOrder {

    private String bouquetType;
    private  int numberOfRosesAdded;
    private BigDecimal subtotal;

    BigDecimal oneBouquet = new BigDecimal(19.99);
    BigDecimal rose = new BigDecimal(2.99);


    public FlowerShopOrder(String bouquetType, int numberOfRosesAdded) {
        this.bouquetType = bouquetType;
        this.numberOfRosesAdded = numberOfRosesAdded;
        this.subtotal = rose.multiply(new BigDecimal(numberOfRosesAdded)).add(oneBouquet);

    }

    public BigDecimal calculateDeliveryTotal(boolean sameDayDelivery, String zipCode) {
        // 20000 - 29999    3.99             5.99
        // 30000 - 39999    6.99             5.99
        // 10000 - 19999    0                 0
        // 0 -9999  && 40000 ~ 19.99

        BigDecimal costAdded = new BigDecimal(0.00);
        costAdded.setScale(2, RoundingMode.HALF_UP);



            if ((zipCode.startsWith("2") && zipCode.length()==5) && sameDayDelivery) {
                BigDecimal sameDay1 = new BigDecimal(9.98);
//                sameDay1.setScale(2,RoundingMode.HALF_UP);
//                costAdded.setScale(2,RoundingMode.HALF_UP);
                return costAdded.setScale(2, RoundingMode.HALF_UP).add(sameDay1.setScale(2, RoundingMode.HALF_UP));

            } else if ((zipCode.startsWith("3") && zipCode.length()==5) && sameDayDelivery) {
                BigDecimal sameDay2 = new BigDecimal(12.98);
                return costAdded.setScale(2, RoundingMode.HALF_UP).add(sameDay2.setScale(2, RoundingMode.HALF_UP));

            } else if ((zipCode.startsWith("2") && zipCode.length()==5) && !sameDayDelivery) {
                        BigDecimal regular1 = new BigDecimal(3.99);
                        return costAdded.setScale(2, RoundingMode.HALF_UP).add(regular1.setScale(2, RoundingMode.HALF_UP));
            }  else if ((zipCode.startsWith("3") && zipCode.length()==5) && !sameDayDelivery) {
                        BigDecimal regular2 = new BigDecimal(6.99);
                        return costAdded.setScale(2, RoundingMode.HALF_UP).add(regular2.setScale(2, RoundingMode.HALF_UP));

                    } else if ((zipCode.startsWith("1") && zipCode.length()==5) && !sameDayDelivery ||  (zipCode.startsWith("1") && zipCode.length()==5) && sameDayDelivery) {
                BigDecimal regular3 = new BigDecimal(0.00);
                return costAdded.setScale(2, RoundingMode.HALF_UP).add(regular3.setScale(2, RoundingMode.HALF_UP));

                    } else {
                BigDecimal regular4 = new BigDecimal(19.99);
                return costAdded.setScale(2, RoundingMode.HALF_UP).add(regular4.setScale(2, RoundingMode.HALF_UP));
            }

        }



    @Override
    public String toString() {
        return "ORDER -" +
                " { " + bouquetType + " } "+
                " { " + numberOfRosesAdded + " } ROSES " +
                " {  $" + this.subtotal.setScale(2, RoundingMode.HALF_UP) + " } ";
    }

    public String getBouquetType() {
        return bouquetType;
    }

    public int getNumberOfRosesAdded() {
        return numberOfRosesAdded;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }
}

public class car {

    String model;
    String colur;
    int price ;

    car(String model, String colur, int price) {

        this.model= model;
        this.colur= colur;
        this.price = price;



    }


    String getModel()
    {
        return this.model;
    }

    String getColur()
    {
        return this.colur;
    }

    int getPrice()
    {
        return this.price;
    }
}

package SF_222.Exercise_2;

class Book {
    String name;
    Author author;
    double price;
    int qtyInStock = 0;

    public Book (String n, Author a, double p)
    {
        name = n;
        author = a;
        price = p;
    }

    public Book (String n, Author a, double p, int q)
    {
        name = n;
        author = a;
        price = p;
        qtyInStock = q;
    }

    public String getName()
    {
        return name;
    }

    public Author getAuthor()
    {
        return author;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double p)
    {
        this.price = p;
    }

    public int getQtyInStock()
    {
        return qtyInStock;
    }

    public void setQtyInStock(int q)
    {
        this.qtyInStock = q;
    }
}

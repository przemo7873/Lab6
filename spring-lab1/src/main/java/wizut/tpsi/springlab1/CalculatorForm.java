package wizut.tpsi.springlab1;

public class CalculatorForm 
{
    private Integer X;
    private Integer Y;
    private String operacja;
    public Integer getX() 
    {
        return X;
    }
    public void setX(Integer X) 
    {
        this.X = X;
    }
    public Integer getY() 
    {
        return Y;
    }
    public void setY(Integer Y) 
    {
        this.Y = Y;
    }
    public String getOperacja() 
    {
        return operacja;
    }
    public void setOperacja(String operacja) 
    {
        this.operacja = operacja;
    }
    public  Integer dodawanie()
    {
        return X+Y;
    }
    public  Integer odejmowanie()
    {
        return X-Y;
    }
    public  Integer mnozenie()
    {
        return X*Y;
    }
}

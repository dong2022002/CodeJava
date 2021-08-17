

public class ToanSo
{
    public int n=0;
    public ToanSo() 
    {
    }
    public ToanSo(int n) {
        this.n=n;
    }
    // public double tinhToanCau1(int x)
    // {
        
    //     if(x==1)return 1;
    //     return (1/(Math.pow(x,3))+tinhToanCau1(x-1));
    // }
    public double tinhCau1()
    {
        double kq =0;
        for(int i=1;i<=n;i++)
        {
           kq+=(1/(double)(Math.pow(i, 3))); 
        }
        return kq;
    }
    public double tinhCau2()
    {
        double kq=(double)2/3;
        for(int i=1;i<=n;i++)
        {
            kq*=(double)(2*(i+1))/(2*i+3);
        }
        return kq;
    }
    
    
  
    @Override
    public String toString()
    {
        
        return "Ket qua cua phep toan (1+ 1/(2*3) + 1/(3*3) +...+ 1/(2*n) )la:"+Math.floor(tinhCau1()*1000)/1000+
        "\nKet qua cua phep toan (2/3 * 4/5 * 6/7 * ... * (2(n+1)/(2n+3)) la:"+tinhCau2();
    }


}

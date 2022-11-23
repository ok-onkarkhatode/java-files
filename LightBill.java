class LightBill
{
 private long meterNo;
 private static  int minimumunits;
 private static int extraunit;
 private String date;

 LightBill(long meterNo,int minimumunits,int extraunit,String date)
 {
	 this.meterNo=meterNo;
	 this.minimumunits=minimumunits;
	 this.extraunit=extraunit;
	 this.date=date;	 
 }
}
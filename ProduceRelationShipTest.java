public class ProduceRelationShipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		PharmaLab pharma = new PharmaLab();
		Chemical chemical = pharma.generate();
		MedicineContent medCont = chemical.boil();
		Tablets tablet = medCont.solid();
		Injection inj = medCont.liquid();
		tablet.ready();
		inj.ready();
	}
}


class Lab {	
	
	String boiler;
	String heatmachine;
	
}

class PharmaLab extends Lab
{
	
	Chemical generate() {
		Chemical chemical = new Chemical();
		return chemical;
	}
}
class Chemical
{
	
	MedicineContent boil() {
		MedicineContent rawMed = new MedicineContent();
		return rawMed;
	}
}
class MedicineContent{
	
	Tablets solid(){
		Tablets tablet = new Tablets();
		return tablet;
	}
	
	Injection liquid() {
		Injection inj = new Injection();
		return inj;
	}

}

class Tablets
{
	void ready()
	{
		System.out.println("Tablet ready for patient....");
	}
}
class Injection{
	
	void ready()
	{
		System.out.println("Injection ready for patient....");
	}	
}
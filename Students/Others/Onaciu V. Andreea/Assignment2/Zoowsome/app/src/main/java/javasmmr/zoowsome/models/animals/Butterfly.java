package javasmmr.zoowsome.models.animals;


import javasmmr.zoowsome.Constants;

public class Butterfly extends javasmmr.zoowsome.models.animals.Insect {
	public Butterfly(double cost, double danger) {
		super(cost, danger);
		setCanFly(true);
		setIsDangerous(false);
		setNrOfLegs(6);
		setName("butterfly");

	}

	public Butterfly() {
		super(1, 0);
		setCanFly(true);
		setIsDangerous(false);
		setNrOfLegs(6);
		setName("butterfly");

	}

	public Butterfly(int nrOfLegs, String name, double cost, double danger, boolean canFly, boolean isDangerous) {
		super(nrOfLegs, name, cost, danger, canFly, isDangerous);
	}

/*	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Butterfly);
	}*/
}

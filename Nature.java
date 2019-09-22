public class Nature {

	public static void main(String[] args) {

		Penguin pingou = new Penguin("Pingou");
		pingou.dive();
		pingou.swimDown(3);
		pingou.swimUp(1);
		pingou.swimDown(4);
		pingou.swimUp(5);
		pingou.swimUp(1);
		pingou.getOut();

		Eagle eyeCherry = new Eagle("Eye Cherry");
		// TODO : décommente le code suivant afin de le tester
		eyeCherry.takeOff();
		eyeCherry.ascend(2800);
		eyeCherry.ascend(3500);
		eyeCherry.glide();
		eyeCherry.descend(4000);
		eyeCherry.land();
		eyeCherry.descend(51);
		eyeCherry.land();
		eyeCherry.descend(5);
		eyeCherry.land();
	}
}

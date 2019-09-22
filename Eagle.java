/**
 * @author franck
 *
 */
/**
 * @author franck
 *
 */
/**
 * @author franck
 *
 */
public class Eagle extends Bird implements Fly {

	private boolean flying;
	private int altitude;

	/**
	 * @param name
	 */
	public Eagle(String name) {
		super(name);
		this.flying = false;
		this.altitude = 0;
	}

	/**
	 * @description
	 *
	 * @return int
	 *
	 * @method getAltitude
	 * @class Eagle
	 * @version 1.0
	 * @date dimanche 22 sept. 2019
	 * @see
	 *
	 **/
	public int getAltitude() {
		return altitude;
	}

	/**
	 * @description
	 *
	 * @return boolean
	 *
	 * @method isFlying
	 * @class Eagle
	 * @version 1.0
	 * @date dimanche 22 sept. 2019
	 * @see
	 *
	 **/
	public boolean isFlying() {
		return flying;
	}

	@Override
	public String sing() {
		return "Screech!";
	}

	/**
	 * /**
	 * 
	 * @description on peut ne pas l'implementer car elle a une methode par defaut
	 *              dans l'interface Fly. Il est possible aussi de lui donner une
	 *              autre implementation
	 * @return void
	 *
	 * @method glide
	 * @class Eagle
	 * @version 1.0
	 * @date dimanche 22 sept. 2019
	 * @see
	 *
	 **/
//	@Override
//	public void glide() {
////		System.out.println("I am not puffy!");
//
//	}

	@Override
	public void takeOff() {
		System.out.println(getName() + " take off in Montana");

	}

	@Override
	public int ascend(int meters) {
		if (!this.flying && this.altitude == 0) {
			this.flying = true;
//			this.altitude = Math.max(this.altitude + meters, 3500);
			this.altitude = meters - 5;
			System.out.printf("%s fly into the air.%n", this.getName());
			System.out.println(getName() + " ascending to altitude of " + meters + " m");
		}
		return this.altitude;
	}

	@Override
	public int descend(int meters) {
		if (this.flying) {
			this.flying = true;
			this.altitude = meters - 5;
//			this.altitude = Math.min(Math.abs(this.altitude - meters), 0);
			System.out.printf("%s flying downward, altitude : %d%n", this.getName(), this.altitude);
		}
		System.out.println(" and continue to altitude of " + (meters + 50) + " m");
		return this.altitude;
	}

	@Override
	public void land() {
		if (this.flying && this.altitude >= 2700) {
			System.out.printf("%s flying very very high!.%n", this.getName());
		} else if (this.flying && this.altitude <= 50 && this.altitude > 10) {
			System.out.printf("%s flying to catch perdigona.%n", this.getName());
		} else {
			System.out.println(getName() + "  prefer flying on missipi river");
		}
	}
}

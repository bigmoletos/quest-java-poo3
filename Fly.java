
/**
 * @author franck
 *
 */
public interface Fly {
	/**
	 * @description sans argument, qui ne retourne rien
	 *
	 * @return void
	 *
	 * @method takeOff
	 * @class Fly
	 * @version 1.0
	 * @date dimanche 22 sept. 2019
	 * @see
	 *
	 **/
	void takeOff();

	/**
	 * @description qui prend un entier meters, qui retourne un entier // return
	 *              meters;
	 *
	 * @return int
	 *
	 * @method ascend
	 * @class Fly
	 * @version 1.0
	 * @param meters
	 * @date dimanche 22 sept. 2019
	 * @see
	 *
	 **/
	int ascend(int meters);

	/**
	 * @description qui prend un entier meters, qui retourne un entier // return
	 *              meters;
	 *
	 * @return int
	 *
	 * @method descend
	 * @class Fly
	 * @version 1.0
	 * @param meters
	 * @date dimanche 22 sept. 2019
	 * @see
	 *
	 **/
	int descend(int meters);

	/**
	 * @description sans argument, qui ne retourne rien
	 *
	 * @return void
	 *
	 * @method land
	 * @class Fly
	 * @version 1.0
	 * @date dimanche 22 sept. 2019
	 * @see
	 *
	 **/
	void land();

	/**
	 * @description sans argument, qui ne retourne rien et qui possède un
	 *              comportement System.out.println("It glides into the air.");
	 *
	 * @return void
	 *
	 * @method glide
	 * @class Fly
	 * @version 1.0
	 * @date dimanche 22 sept. 2019
	 * @see
	 *
	 **/
	default void glide() {
		System.out.println("It glides into the air.");
	}
}

package functional_interface;

public class functional_interface {

	public static void main(String[] args) {
		/* Qualquer interface com um SAM (Single Abstract Method) � uma
		 * interface funcional e sua implementa��o pode ser tratada como
		 * express�es lambda*/
		
		@FunctionalInterface
		public interface Comparator<T>{
			@Contract(pure=true) int compare(T var1, T var2);
		}
	}

}

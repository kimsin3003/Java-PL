import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class InvokeClass {

	public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		
		Class c = DataClassLoader.loadClass("http://localhost:9090/", "RemoteData");
		Class[] parameterTypes = { String.class, String.class };
		Constructor cons = c.getConstructor(parameterTypes);
		Object[] initargs = new Object[]{"선생님", "서울"};
		Object obj = cons.newInstance(initargs);
		
		Method m = c.getMethod("sayHello", String.class);
		m.invoke(obj, "선생");
	}

}

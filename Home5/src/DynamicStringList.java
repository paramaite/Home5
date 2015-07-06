

import java.util.Arrays;

public class DynamicStringList implements SimpleList {

	private int index = 0;
	private String[] stringData;

	public DynamicStringList() {
		stringData = new String[0];
	}

	public DynamicStringList(int size) {
		stringData = new String[size];
	}

	@Override
	public void add(String s) {
		if (index + 1 - stringData.length > 0){
			stringData = Arrays.copyOf(stringData, index + 1);}
		stringData[index++] = s;
	}

	@Override
	public String get() {
		return stringData[index - 1];
	}

	@Override
	public String get(int id) {
		return stringData[id];
	}

	@Override
	public String remove() {
		String oldValue = stringData[index];
		stringData[--index] = null;
		return oldValue;
	}

	@Override
	public String remove(int id) {
		String oldValue = stringData[id];
		int numMoved = index - id - 1;
		System.arraycopy(stringData, id + 1, stringData, id, numMoved);
		stringData[--index] = null;
		return oldValue;
	}

	@Override
	public boolean delete() {
		for (int i = 0; i < index; i++)
			stringData[i] = null;
		index = 0;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < index; i++){
			if (i!=0) sb.append(", ");
			sb.append(stringData[i]);
		}
		sb.append("]");
		
		return sb.toString();
	}

}

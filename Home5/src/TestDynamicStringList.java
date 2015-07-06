

/*1. ������� ��������� SimpleList, ������� ���������� ������ ������������� �������, ���������������� ��� �������� �����:
void add(String s) - �������� ������ � ������
String get() - �������� ��������� ������� �� �������
String get(int id) - �������� ������� �� ��� �������
String remove() - ������� ��������� �������
String remove(int id) - ������� ������� �� �������
boolean delete() - ������� ��� �������� �������.
2. ������� ����� DynamicStringList, ������� ��������� ��� ������ ���������� SimpleList. ��� �������� ��������� ����������� � ������ ���� DynamicStringList ������ �������������� ������� 
Java-������.
3. � ������ DynamicStringList ������������� 2 ������������: �)������ � �) � �������� ����������, ������������ ��������� ������ ������� ��� �������� �����.
4. ��� ����, ������������ � ������ ��� �������� ��������� ������� ������ ���� ���������������.
5. �������������� ����� toString ����� ������, ��� ������ ���� �����, ������� �������� � ������� ���� DynamicStringList
6. ������� ������ ���� DynamicStringList. ������������������ ����������, ����������, �������� ����� �� �������, � ����� ����� �� ����� ��� �����������.
5. �� ����� ����������� ��������� ������ ���� ������������ ���������� �� java code convention.
6. ����������� ������� ��������� � SVN ����������� �� ������ http://oracle-academy.org.ua/svn/<��� �������>/<Jira login>*/


public class TestDynamicStringList {

	public static void main(String[] args) {
		DynamicStringList listString = new DynamicStringList();
		listString.add("Hello");
		listString.add("Oracle");
		listString.add("Acedamy");
		listString.add("Ishchenko");
		System.out.println(listString);
		listString.remove(0);
		System.out.println(listString);
		System.out.println(listString.get(1));
		System.out.println(listString.get());
		listString.remove();
		System.out.println(listString);
		listString.delete();
		System.out.println(listString);
	}

}

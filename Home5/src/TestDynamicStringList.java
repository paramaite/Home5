

/*1. Создать интерфейс SimpleList, который определяет методы динамического массива, предназначенного для хранения строк:
void add(String s) - добавить строку в массив
String get() - получить последний элемент из массива
String get(int id) - получить элемент по его индексу
String remove() - удалить последний элемент
String remove(int id) - удалить элемент по индексу
boolean delete() - удалить все элементы массива.
2. Создать класс DynamicStringList, который реализует все методы интерфейса SimpleList. Для хранения элементов добавленных в объект типа DynamicStringList должен использоваться обычный
Java-массив.
3. В классе DynamicStringList предусмотреть 2 конструктора: а)пустой и б) с числовым аргументом, определяющим начальный размер массива для хранения строк.
4. Все поля, используемые в классе для хранения элементов массива должны быть инкапсулированы.
5. Переопределить метод toString этого класса, для вывода всех строк, которые хранятся в объекте типа DynamicStringList
6. Создать объект типа DynamicStringList. Продемонстрировать добавление, извлечение, удаление строк из объекта, а также вывод на экран его содержимого.
5. На этапе составления программы должны быть использованы соглашения из java code convention.
6. Выполненное задание переслать в SVN репозатарий по адресу http://oracle-academy.org.ua/svn/<Имя проекта>/<Jira login>*/


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

package test;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String args[]) {

		String[] words = { "television", "computer", "mouse", "phone" };

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {

			char[] question = words[i].toCharArray(); // String�� char[]�� ��ȯ
			System.out.println(question.length);
			for (int k = 0; k < question.length; k++) {
				char tmp = 0;
				int j = (int) (Math.random() * (question.length - k));
				// ������ �Ʊ�ʹ� �ٸ��� ���ڿ��� ��ġ�� �ƴϿ����� ��������
				tmp = question[k];
				question[k] = question[j];
				question[j] = tmp;
			}

			System.out.printf("Q%d. %s�� ������ �Է��ϼ��� .> ", i + 1, new String(

					question));

			String answer = scanner.nextLine();

			// trim()���� answer�� �¿� ������ ������ �� , equals�� word[i]�� ��

			if (words[i].equals(answer.trim()))

				System.out.printf("�¾ҽ��ϴ�.%n%n");

			else

				System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");

		}

	} // main�� ��

}
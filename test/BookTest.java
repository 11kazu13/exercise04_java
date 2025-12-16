package exercise04.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exercise04.Book;

// Book クラスのテストクラス
public class BookTest {

	private Book book;

	@Before
	public void setUp() {
		// テスト用Bookインスタンスの生成
		book = new Book("Java入門", "山田太郎", "1234567890");
	}

	@Test
	public void testConstructor() {
		// コンストラクタで設定した値が正しいか確認
		assertEquals("Java入門", book.title);
		assertEquals("山田太郎", book.author);
		assertEquals("1234567890", book.getIsbn());
		assertFalse(book.isLent());
	}

	@Test
	public void testLendAndReturn() {
		// 貸出処理後に貸出状態がtrueになっているか確認
		book.lend();
		assertTrue(book.isLent());

		// 返却処理後に貸出状態がfalseになっているか確認
		book.returnBook();
		assertFalse(book.isLent());
	}

	@Test
	public void testSetIsbn() {
		// ISBNを変更して取得できるか確認
		book.setIsbn("9999999999");
		assertEquals("9999999999", book.getIsbn());
	}
}

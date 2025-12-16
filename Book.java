package exercise04;

// Book クラスは Material を継承
public class Book extends Material {
	// ISBN
	private String isbn;

	// 貸出状態（true:貸出中, false:未貸出）
	private boolean isLent;

	// 引数なしコンストラクタ
	public Book() {
		super();
		this.isbn = "未設定";
		this.isLent = false;
	}

	// 引数ありコンストラクタ（タイトル・著者・ISBN設定）
	public Book(String title, String author, String isbn) {
		super(title, author);
		this.isbn = isbn;
		this.isLent = false;
	}

	// MaterialのshowMaterialをオーバーライドしてISBN・貸出状態も表示
	@Override
	public void showMaterial() {
		System.out.printf("タイトル：%s, 著者：%s, ISBN：%s, 貸出状態：%b\n", super.title, super.author, this.isbn, this.isLent);
	}

	// 貸出処理（貸出状態をtrueにする）
	public void lend() {
		this.isLent = true;
	}

	// 返却処理（貸出状態をfalseにする）
	public void returnBook() {
		this.isLent = false;
	}

	// ISBNを取得するgetter
	public String getIsbn() {
		return this.isbn;
	}

	// 貸出状態を取得するgetter
	public boolean isLent() {
		return this.isLent;
	}

	// 貸出状態を設定するsetter
	public void setLent(boolean isLent) {
		this.isLent = isLent;
	}

	// ISBNを設定するsetter
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}

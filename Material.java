package exercise04;

// 資料管理用の親クラス
public class Material {
	// タイトル
	public String title;

	// 著者
	public String author;

	// 引数なしコンストラクタ（初期値設定）
	public Material() {
		this.title = "未設定";
		this.author = "未設定";
	}

	// 引数ありコンストラクタ（タイトルと著者を設定）
	public Material(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// 資料情報を表示するメソッド
	public void showMaterial() {
		System.out.printf("タイトル：%s, 著者：%s\n", this.title, this.author);
	}
}

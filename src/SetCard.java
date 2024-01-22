public class SetCard {
	public static void main( String[] args ) {
		
		int card;
        int mark;
        int num;

		
		CardsManager cards = new CardsManager();

		// トランプをシャッフル
		cards.shuffle();
		for ( int i = 1; i <= 52; ++ i ) {
			card = cards.get( i );

			// マーク
			mark = card / 100;
			// 数字
			num = card % 100;
			switch ( mark ) {
				
				case 1:
					// スペード
					System.out.println( "♤" + num );
					break;
				case 2:
					// ハート
					System.out.println( "♡" + num );
					break;
				case 3:
					// ダイヤ
					System.out.println( "♢" + num );
					break;
				case 4:
					// クラブ
					System.out.println( "♧" + num );
					break;
			}
		}
	}
}
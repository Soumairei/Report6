class CardsManager {
	private int[] cards;

	
	//  000 : ジョーカー
	//  101～113 : スペードの1～13
	//  201～213 : ハートの1～13
	//  301～313 : ダイヤの1～13
	//  401～413 : クラブの1～13

	// コンストラクタ
	public CardsManager()
	{
		// 配列を作成
		cards = new int[ 13 * 4 + 1 ];

		
		reset();
	}


	// トランプの整列
	public void reset()
	{
		
		

		for ( int i = 0; i <= 12; ++ i ) {
			
			cards[ i ] = 100 + i;
          }
		for ( int i = 0; i <= 12; ++ i ) {
			cards[i+13]=200+i;	
		  }
		for (int i=0;i<=12; ++i){
			cards[i+26]=300+i;
		}
		for (int i=0;i<=12;++i){
			cards[i+39]=400+i;
		}
	}
		


	// トランプのシャッフル
	public void shuffle()
	{
		for ( int i = 0; i < cards.length; ++ i ) {
			
			int rnd = (int)( Math.random() * (double)cards.length );

			// cards[ i ]とcards[ rnd ]を入れ替える
			int w = cards[ i ];
			cards[ i ] = cards[ rnd ];
			cards[ rnd ] = w;
		}
	}
	public int get( int num )
	{
		
		if ( ( 1 > num ) || ( 53 < num ) ) return -1;

		// カードを戻す
		return cards[ num - 1 ];
	}


	
	
}

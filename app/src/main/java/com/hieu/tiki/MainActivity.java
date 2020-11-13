package com.hieu.tiki;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    CardAdapter cardAdapter;
    List<CardItem> lc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridView);
        lc=getListData();
        cardAdapter=new CardAdapter(this,lc);
        gridView.setAdapter(cardAdapter);
        registerForContextMenu(this.gridView);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CardItem cardItem=(CardItem) getListData().get(position);
                Intent intent=new Intent(MainActivity.this,GridContext.class);
                intent.putExtra("noidung",cardItem.getMota());
                startActivity(intent);
            }
        });
    }

    private List<CardItem> getListData() {
        List<CardItem> cardItemList=new ArrayList<>();
        CardItem cardItem1=new CardItem(R.drawable.loa1,"Loa Bluetooth Di Động P88 P89 NT88 Âm Thanh Cực Chuẩn + Tặng Kèm Micro Hát Karaoke Cực Hay","Phát nhạc qua thẻ nhớ, usb, Bluetooth, cáp nối trực tiếp qua DVD, amply, Laptop, điện thoại, nghe FM\n" +
                "Dùng để hát karaoke gia đình, trợ giảng...\n" +
                "Âm thanh lớnhay, nhạc rõ nét không rè.\n" +
                "Nút chỉnh đầy đủ chức năng , volume, echo\n" +
                "Kích thước nhỏ gọn dễ dàng di chuyển\n" +
                "Khoảng cách kết nối: ~ 20m\n" +
                "Dung lượng pin: 1800mAh\n" +
                "Thời gian sử dụng: 6 - 12h\n" +
                "Kết nối bluetooth\n" +
                "Hỗ trợ chức năng nghe nhạc MP3 từ: USB/ TF card\n" +
                "Bass lớn, hát cực hay\n" +
                "Công suất 150W\n" +
                "Bảo hành 1 đổi 1 tại KIOMIC");
        CardItem cardItem3=new CardItem(R.drawable.loa2,"Loa bluetooth BT-606 tặng kèm Micro karaoke thoải mái, remote điều khiển từ xa tiện lợi, âm thanh HIFI, có đèn LED phát sáng, hỗ trợ nghe nhạc bằng USB, thẻ nhớ TF, cổng AUX 3.5mm","Thiết kế mang đến cái nhìn sang trọng.\n" +
                "Khả năng chống nước hoàn hảo.\n" +
                "Loa LG PK3 giúp cho cuộc vui của bạn và gia đình trở nên trọn vẹn hơn.\n" +
                "Kết nối Bluetooth không dây cho khoảng cách kết nổi ổn định lên tới 10m.\n" +
                "Công suất cực lớn lên tới 16W, đáp ứng đủ mọi nhu cầu sử dụng của bạn.\n" +
                "Với thời gian sạc chỉ khoảng 3-4 tiếng, chiếc loa LG XBOOM PK3 đã cho phép bạn sử dụng với thời gian lên tới 10-12 tiếng đồng hồ.\n" +
                "Công nghệ âm thanh Enhanced Bass giúp cho giai điệu của bài hát được trở nên trọn vẹn hơn.\n" +
                "Hai màng rung cộng hưởng giúp âm bass trở nên tuyêt vời hơn bao giờ hết.\n" +
                "Số lượng loa BASS: 1\n" +
                "Số lượng loa TrebleL: 1\n" +
                "Kích thước: 18x8x8cm .\n" +
                "Trọng lượng: 1080g.\n" +
                "Bảo hành 12 tháng toàn quốc, lỗi 1 đổi 1");
        CardItem cardItem4=new CardItem(R.drawable.loa3,"Loa hát karaoke Bluetooth JVJ SD306 kèm 2 micro - Micro Không dây, hỗ trợ hiệu ứng âm thanh, công suất loa lớn","Thiết kế mang đến cái nhìn sang trọng.\n" +
                "Khả năng chống nước hoàn hảo.\n" +
                "Loa LG PK3 giúp cho cuộc vui của bạn và gia đình trở nên trọn vẹn hơn.\n" +
                "Kết nối Bluetooth không dây cho khoảng cách kết nổi ổn định lên tới 10m.\n" +
                "Công suất cực lớn lên tới 16W, đáp ứng đủ mọi nhu cầu sử dụng của bạn.\n" +
                "Với thời gian sạc chỉ khoảng 3-4 tiếng, chiếc loa LG XBOOM PK3 đã cho phép bạn sử dụng với thời gian lên tới 10-12 tiếng đồng hồ.\n" +
                "Công nghệ âm thanh Enhanced Bass giúp cho giai điệu của bài hát được trở nên trọn vẹn hơn.\n" +
                "Hai màng rung cộng hưởng giúp âm bass trở nên tuyêt vời hơn bao giờ hết.\n" +
                "Số lượng loa BASS: 1\n" +
                "Số lượng loa TrebleL: 1\n" +
                "Kích thước: 18x8x8cm .\n" +
                "Trọng lượng: 1080g.\n" +
                "Bảo hành 12 tháng toàn quốc, lỗi 1 đổi 1");
        CardItem cardItem5=new CardItem(R.drawable.loa4,"Loa Bluetooth di động 20W Minchan - Loa kéo P87, NT8, NT9 Âm Thanh Cực Hay - Loa Mini - Loa Vi Tinh - Loa May Tinh KIOMIC","Thiết kế mang đến cái nhìn sang trọng.\n" +
                "Khả năng chống nước hoàn hảo.\n" +
                "Loa LG PK3 giúp cho cuộc vui của bạn và gia đình trở nên trọn vẹn hơn.\n" +
                "Kết nối Bluetooth không dây cho khoảng cách kết nổi ổn định lên tới 10m.\n" +
                "Công suất cực lớn lên tới 16W, đáp ứng đủ mọi nhu cầu sử dụng của bạn.\n" +
                "Với thời gian sạc chỉ khoảng 3-4 tiếng, chiếc loa LG XBOOM PK3 đã cho phép bạn sử dụng với thời gian lên tới 10-12 tiếng đồng hồ.\n" +
                "Công nghệ âm thanh Enhanced Bass giúp cho giai điệu của bài hát được trở nên trọn vẹn hơn.\n" +
                "Hai màng rung cộng hưởng giúp âm bass trở nên tuyêt vời hơn bao giờ hết.\n" +
                "Số lượng loa BASS: 1\n" +
                "Số lượng loa TrebleL: 1\n" +
                "Kích thước: 18x8x8cm .\n" +
                "Trọng lượng: 1080g.\n" +
                "Bảo hành 12 tháng toàn quốc, lỗi 1 đổi 1");
        CardItem cardItem6=new CardItem(R.drawable.loa5,"Loa Kéo Karaoke Bluetooth Kiomic Q8 Pro Tặng Micro Không Dây Hát Siêu Hay Mẫu Mới 2020 - Phân Phối Toàn Quốc","Thiết kế mang đến cái nhìn sang trọng.\n" +
                "Khả năng chống nước hoàn hảo.\n" +
                "Loa LG PK3 giúp cho cuộc vui của bạn và gia đình trở nên trọn vẹn hơn.\n" +
                "Kết nối Bluetooth không dây cho khoảng cách kết nổi ổn định lên tới 10m.\n" +
                "Công suất cực lớn lên tới 16W, đáp ứng đủ mọi nhu cầu sử dụng của bạn.\n" +
                "Với thời gian sạc chỉ khoảng 3-4 tiếng, chiếc loa LG XBOOM PK3 đã cho phép bạn sử dụng với thời gian lên tới 10-12 tiếng đồng hồ.\n" +
                "Công nghệ âm thanh Enhanced Bass giúp cho giai điệu của bài hát được trở nên trọn vẹn hơn.\n" +
                "Hai màng rung cộng hưởng giúp âm bass trở nên tuyêt vời hơn bao giờ hết.\n" +
                "Số lượng loa BASS: 1\n" +
                "Số lượng loa TrebleL: 1\n" +
                "Kích thước: 18x8x8cm .\n" +
                "Trọng lượng: 1080g.\n" +
                "Bảo hành 12 tháng toàn quốc, lỗi 1 đổi 1");
        CardItem cardItem7=new CardItem(R.drawable.loa6,"Loa Bluetooth Karaoke Công Suất Cực Lớn, Loa Xach Tay Mini KIOMIC K68(Tặng Kèm Micro Không Dây) - Bảo Hành 1 Đổi 1 Phân Phối Toàn Quốc","Thiết kế mang đến cái nhìn sang trọng.\n" +
                "Khả năng chống nước hoàn hảo.\n" +
                "Loa LG PK3 giúp cho cuộc vui của bạn và gia đình trở nên trọn vẹn hơn.\n" +
                "Kết nối Bluetooth không dây cho khoảng cách kết nổi ổn định lên tới 10m.\n" +
                "Công suất cực lớn lên tới 16W, đáp ứng đủ mọi nhu cầu sử dụng của bạn.\n" +
                "Với thời gian sạc chỉ khoảng 3-4 tiếng, chiếc loa LG XBOOM PK3 đã cho phép bạn sử dụng với thời gian lên tới 10-12 tiếng đồng hồ.\n" +
                "Công nghệ âm thanh Enhanced Bass giúp cho giai điệu của bài hát được trở nên trọn vẹn hơn.\n" +
                "Hai màng rung cộng hưởng giúp âm bass trở nên tuyêt vời hơn bao giờ hết.\n" +
                "Số lượng loa BASS: 1\n" +
                "Số lượng loa TrebleL: 1\n" +
                "Kích thước: 18x8x8cm .\n" +
                "Trọng lượng: 1080g.\n" +
                "Bảo hành 12 tháng toàn quốc, lỗi 1 đổi 1");

        cardItemList.add(cardItem1);
        cardItemList.add(cardItem3);
        cardItemList.add(cardItem4);
        cardItemList.add(cardItem5);
        cardItemList.add(cardItem6);
        cardItemList.add(cardItem7);
        return cardItemList;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Chọn hành động");
        menu.add(0,1,0,"Xóa");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        final AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        final CardItem cardItemSelected=(CardItem) this.getListData().get(info.position);
        if(item.getItemId() == 1){
            // Ask before deleting.
            new AlertDialog.Builder(this)
                    .setMessage(cardItemSelected.getTen()+". Bạn có muốn xoá?")
                    .setCancelable(false)
                    .setPositiveButton("Có", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            deleteItem(info.position);
                        }
                    })
                    .setNegativeButton("Không", null)
                    .show();
        }
        else
            return false;
        return true;
    }
    private void deleteItem(int item)  {
        lc.remove(item);
        cardAdapter.notifyDataSetChanged();
    }
}
import {Component, OnInit} from '@angular/core';
import {OrderServiceService} from "../../service/order-service.service";
import {Order} from "../../model/order";

@Component({
  selector: 'app-serach-order',
  templateUrl: './serach-order.component.html',
  styleUrls: ['./serach-order.component.css']
})
export class SerachOrderComponent implements OnInit{


  orders:Order[]=[]
  constructor( private orderServive:OrderServiceService) {
  }


  ngOnInit(): void {
  }

  doSearch(value: string) {

    alert(value);
  this.orderServive.getOrdersByKey(value).subscribe(
    data=>{
      this.orders=data;

    }
  )
  }
}

import {Component, OnInit} from '@angular/core';
import {OrderServiceService} from "../../service/order-service.service";
import {Order} from "../../model/order";
import {Router} from "@angular/router";
import * as url from "url";

@Component({
  selector: 'app-serach-order',
  templateUrl: './serach-order.component.html',
  styleUrls: ['./serach-order.component.css']
})
export class SerachOrderComponent implements OnInit{

  // orders:Order[]=[]
  constructor( private orderServive:OrderServiceService , private router:Router) {
  }

  ngOnInit(): void {
  }

  doSearch(value: string) {

    this.router.navigateByUrl('/orders/'+value)


  }
}

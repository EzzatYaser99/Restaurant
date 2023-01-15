import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

import { Order } from '../model/order';
import {map, Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class OrderServiceService {


  private baseUrl='http://localhost:8080/api/allOrder';
  constructor(private http:HttpClient) { }

getOrders():Observable<Order[]>{
    return this.http.get<Order[]>(this.baseUrl).pipe(

      map(
        reponse=>reponse
      )
    )
}
}

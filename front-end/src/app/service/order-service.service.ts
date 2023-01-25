import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

import { Order } from '../model/order';
import {map, Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class OrderServiceService {

  private baseUrl='http://localhost:8080/api/';
  //private baseUrl='http://localhost:8080/api/allOrder';
  //private url='http://localhost:8080/api/category?id'; ======== http://localhost:8080/api/category/{id}

  constructor(private http:HttpClient) { }

// @ts-ignore
  getOrders(page,size):Observable<Order[]>{
    return this.http.get<Order[]>(`${this.baseUrl}allOrders?page=${page}&size=${size}`).pipe(

      map(
        reponse=>reponse
      )
    )
}
  // @ts-ignore
  getOrdersByCategoryId(id,page,size):Observable<Order[]>{
    return this.http.get<Order[]>(`${this.baseUrl}category?id=${id}&page=${page}&size=${size}`).pipe(

      map(
        reponse=>reponse
      )
    )
  }

  // @ts-ignore
  getOrdersByKey(word ,page,size):Observable<Order[]>{
    return this.http.get<Order[]>(`${this.baseUrl}orderkey?word=${word}&page=${page}&size=${size}`).pipe(

      map(
        reponse=>reponse
      )
    )
  }


  // @ts-ignore
  getOrderById(id):Observable<Order>{

    return  this.http.get<Order>(`${this.baseUrl}order?id=${id}`).pipe(
      map(response=>response)



  )
  }

}

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

getOrders():Observable<Order[]>{
    return this.http.get<Order[]>(`${this.baseUrl}allOrder`).pipe(

      map(
        reponse=>reponse
      )
    )
}
  // @ts-ignore
  getOrdersByCategoryId(id):Observable<Order[]>{
    return this.http.get<Order[]>(`${this.baseUrl}category?id=${id}`).pipe(

      map(
        reponse=>reponse
      )
    )
  }

  // @ts-ignore
  getOrdersByKey(word):Observable<Order[]>{
    return this.http.get<Order[]>(`${this.baseUrl}orderkey?word=${word}`).pipe(

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

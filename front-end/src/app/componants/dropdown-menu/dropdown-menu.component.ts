import {Component, OnInit} from '@angular/core';
import {Category} from "../../model/category";
import {CategoryServiceService} from "../../service/category-service.service";

@Component({
  selector: 'app-dropdown-menu',
  templateUrl: './dropdown-menu.component.html',
  styleUrls: ['./dropdown-menu.component.css']
})
export class DropdownMenuComponent implements OnInit{
  categories:Category[]= [];
  constructor(private categoryService:CategoryServiceService) { }

  ngOnInit(): void {
    this.gettAllCategories();

  }
  gettAllCategories(){
    this.categoryService.getAllCategory().subscribe(
      data=>{
        this.categories=data;
      }



    )


  }
}

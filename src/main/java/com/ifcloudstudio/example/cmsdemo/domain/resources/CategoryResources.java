package com.ifcloudstudio.example.cmsdemo.domain.resources;

import com.ifcloudstudio.example.cmsdemo.domain.models.Category;
import com.ifcloudstudio.example.cmsdemo.domain.requests.CategoryRequest;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/category")
@Api(tags = "category", description = "Category API")
public class CategoryResources {
    @GetMapping(value = "/{id}")
    @ApiOperation(value = "Find category", notes = "Find the Category by ID")
    @ApiResponses(value = {
        @ApiResponse(code = 200,message = "Category found"),
        @ApiResponse(code = 404,message = "Category not found"),
    })
    public ResponseEntity<Category> findOne(@PathVariable("id") String id) {
        return ResponseEntity.ok((new Category()));
    }

    @GetMapping
    @ApiOperation(value = "List categories", notes = "List all categories")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Categories found"),
        @ApiResponse(code = 404, message = "Category not found")
    })
    public ResponseEntity<List<Category>> findAll() {
        return ResponseEntity.ok(Arrays.asList(new Category(), new Category()));
    }

    @PostMapping
    @ApiOperation(value = "Post category", notes = "Save data category")
    @ApiResponses(value = {
        @ApiResponse(code = 200,message = "Categories found"),
        @ApiResponse(code = 404,message = "Category not found")
    })
    @ApiImplicitParams({
        @ApiImplicitParam(name = "name", value = "Object to be created", required = true, dataType = "string", paramType = "body")
    })
    public ResponseEntity<Category> newCategory(CategoryRequest category) {
        return new ResponseEntity<>(new Category(), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation(value = "Remove category", notes = "It permits to remove a category")
    @ApiResponses(value = {
        @ApiResponse(code = 200,message = "Category removed successfully"),
        @ApiResponse(code = 404,message = "Category not found")
    })
    public void removeCategory(@PathVariable("id") String id) {
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation(value = "Update category",notes = "It permits to update a category")
    @ApiResponses(value = {
        @ApiResponse(code = 200,message = "Category update successfully"),
        @ApiResponse(code = 404,message = "Category not found"),
        @ApiResponse(code = 400,message = "Invalid request")
    })
    public ResponseEntity<Category> updateCategory(@PathVariable("id") String id, CategoryRequest category) {
        return new ResponseEntity<>(new Category(), HttpStatus.OK);
    }
}

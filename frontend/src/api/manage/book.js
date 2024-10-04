import request from '@/utils/request'

// 查询书籍管理列表
export function listBook(query) {
  return request({
    url: '/manage/book/list',
    method: 'get',
    params: query
  })
}

// 查询书籍管理详细
export function getBook(id) {
  return request({
    url: '/manage/book/' + id,
    method: 'get'
  })
}

// 新增书籍管理
export function addBook(data) {
  return request({
    url: '/manage/book',
    method: 'post',
    data: data
  })
}

// 修改书籍管理
export function updateBook(data) {
  return request({
    url: '/manage/book',
    method: 'put',
    data: data
  })
}

// 删除书籍管理
export function delBook(id) {
  return request({
    url: '/manage/book/' + id,
    method: 'delete'
  })
}
